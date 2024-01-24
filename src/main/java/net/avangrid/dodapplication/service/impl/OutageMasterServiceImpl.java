package net.avangrid.dodapplication.service.impl;

import net.avangrid.dodapplication.entity.OutageMaster;
import net.avangrid.dodapplication.payload.OutageMasterDTO;
import net.avangrid.dodapplication.repository.OutageMasterRepository;
import net.avangrid.dodapplication.service.OutageMasterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OutageMasterServiceImpl implements OutageMasterService {

    private OutageMasterRepository outageMasterRepository;

    public OutageMasterServiceImpl(OutageMasterRepository outageMasterRepository) {
        this.outageMasterRepository = outageMasterRepository;
    }

    @Override
    public OutageMasterDTO createOutageMaster(OutageMasterDTO outageMasterDTO) {
        OutageMaster outageMaster = outageMasterRepository.save(mapToEntity(outageMasterDTO));
        return mapToDTO(outageMaster);
    }

    @Override
    public List<OutageMasterDTO> getAllOutageMaster() {
        List<OutageMaster> outageMasterList = outageMasterRepository.findAll();
        return outageMasterList.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private OutageMasterDTO mapToDTO(OutageMaster outageMaster){
        OutageMasterDTO outageMasterDTO = new OutageMasterDTO();
        outageMasterDTO.setId(outageMaster.getId());
        outageMasterDTO.setServerCentre(outageMaster.getServerCentre());
        outageMasterDTO.setTown(outageMaster.getTown());
        outageMasterDTO.setStreet(outageMaster.getStreet());
        outageMasterDTO.setPole(outageMaster.getPole());
        outageMasterDTO.setCdeCauseOutage(outageMaster.getCdeCauseOutage());
        outageMasterDTO.setCdeWeatherConditions(outageMaster.getCdeWeatherConditions());
        outageMasterDTO.setCdePurposeOutage(outageMaster.getCdePurposeOutage());
        outageMasterDTO.setQtyPhases(outageMaster.getQtyPhases());
        outageMasterDTO.setCdsExcludeForArp(outageMaster.getCdsExcludeForArp());
        return outageMasterDTO;
    }

    private OutageMaster mapToEntity(OutageMasterDTO outageMasterDTO){
        OutageMaster outageMaster = new OutageMaster();
        outageMaster.setServerCentre(outageMasterDTO.getServerCentre());
        outageMaster.setTown(outageMasterDTO.getTown());
        outageMaster.setStreet(outageMasterDTO.getStreet());
        outageMaster.setPole(outageMasterDTO.getPole());
        outageMaster.setCdeCauseOutage(outageMasterDTO.getCdeCauseOutage());
        outageMaster.setCdeWeatherConditions(outageMasterDTO.getCdeWeatherConditions());
        outageMaster.setCdePurposeOutage(outageMasterDTO.getCdePurposeOutage());
        outageMaster.setQtyPhases(outageMasterDTO.getQtyPhases());
        outageMaster.setCdsExcludeForArp(outageMasterDTO.getCdsExcludeForArp());
        return outageMaster;
    }
}
