package net.avangrid.dodapplication.service.impl;

import net.avangrid.dodapplication.composite.CompositeOutage;
import net.avangrid.dodapplication.entity.OutageDetail;
import net.avangrid.dodapplication.entity.OutageMaster;
import net.avangrid.dodapplication.exception.ResourceNotFoundException;
import net.avangrid.dodapplication.payload.OutageDetailDTO;
import net.avangrid.dodapplication.repository.OutageDetailRepository;
import net.avangrid.dodapplication.repository.OutageMasterRepository;
import net.avangrid.dodapplication.service.OutageDetailService;
import org.springframework.stereotype.Service;

@Service
public class OutageDetailServiceImpl implements OutageDetailService {

    OutageDetailRepository outageDetailRepository;
    OutageMasterRepository outageMasterRepository;

    public OutageDetailServiceImpl(OutageDetailRepository outageDetailRepository, OutageMasterRepository outageMasterRepository){
        this.outageDetailRepository = outageDetailRepository;
        this.outageMasterRepository = outageMasterRepository;
    }

    @Override
    public OutageDetailDTO createOutageDetail(long idOutage, OutageDetailDTO outageDetailDTO) {

        OutageMaster outageMaster = outageMasterRepository.findById(idOutage).orElseThrow(() -> new ResourceNotFoundException("Outage Master", "id", Long.toString(idOutage)));

        OutageDetail outageDetail =  mapToEntity(outageDetailDTO);
        CompositeOutage compositeOutage = new CompositeOutage();
        compositeOutage.setOutageMaster(outageMaster);
        outageDetail.setId(compositeOutage);

        return mapToDTO(outageDetailRepository.save(outageDetail));
    }

    private OutageDetailDTO mapToDTO(OutageDetail outageDetail){
        OutageDetailDTO outageDetailDTO = new OutageDetailDTO();

        outageDetailDTO.setDteTimeOn(outageDetail.getDteTimeOn());
        outageDetailDTO.setQtyCustomersImpacted(outageDetail.getQtyCustomersImpacted());
        outageDetailDTO.setCdeDeviceNo(outageDetail.getCdeDeviceNo());
        outageDetailDTO.setQtyImpactedSmap(outageDetail.getQtyImpactedSmap());
        outageDetailDTO.setIdUser(outageDetail.getIdUser());
        outageDetailDTO.setDteModified(outageDetail.getDteModified());
        outageDetailDTO.setCdsExcludeForIdx(outageDetail.isCdsExcludeForIdx());

        return outageDetailDTO;
    }

    private OutageDetail mapToEntity(OutageDetailDTO outageDetailDTO){
        OutageDetail outageDetail = new OutageDetail();

        outageDetail.setDteTimeOn(outageDetailDTO.getDteTimeOn());
        outageDetail.setQtyCustomersImpacted(outageDetailDTO.getQtyCustomersImpacted());
        outageDetail.setCdeDeviceNo(outageDetailDTO.getCdeDeviceNo());
        outageDetail.setQtyImpactedSmap(outageDetailDTO.getQtyImpactedSmap());
        outageDetail.setIdUser(outageDetailDTO.getIdUser());
        outageDetail.setDteModified(outageDetailDTO.getDteModified());
        outageDetail.setCdsExcludeForIdx(outageDetailDTO.isCdsExcludeForIdx());

        return outageDetail;
    }
}
