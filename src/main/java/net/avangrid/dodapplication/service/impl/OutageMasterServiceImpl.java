package net.avangrid.dodapplication.service.impl;

import net.avangrid.dodapplication.entity.OutageMaster;
import net.avangrid.dodapplication.exception.ResourceNotFoundException;
import net.avangrid.dodapplication.payload.OutageMasterDTO;
import net.avangrid.dodapplication.repository.OutageMasterRepository;
import net.avangrid.dodapplication.service.OutageMasterService;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
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

    @Override
    public OutageMasterDTO getById(long id) {
        OutageMaster outageMaster = outageMasterRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Outage", "id", Long.toString(id)));
        return mapToDTO(outageMaster);
    }

    @Override
    public void deleteById(long id) {
        OutageMaster outageMaster = outageMasterRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Outage", "id", Long.toString(id)));
        outageMasterRepository.delete(outageMaster);
    }

    private OutageMasterDTO mapToDTO(OutageMaster outageMaster){
        OutageMasterDTO outageMasterDTO = new OutageMasterDTO();

        outageMasterDTO.setId(outageMaster.getId());

        outageMasterDTO.setDateTimeOff(outageMaster.getDateTimeOff());
        outageMasterDTO.setDateModified(outageMaster.getDateModified());

        outageMasterDTO.setServerCentre(outageMaster.getServerCentre());
        outageMasterDTO.setTown(outageMaster.getTown());
        outageMasterDTO.setStreet(outageMaster.getStreet());
        outageMasterDTO.setPole(outageMaster.getPole());

        outageMasterDTO.setCdeCauseOutage(outageMaster.getCdeCauseOutage());
        outageMasterDTO.setCdePurposeOutage(outageMaster.getCdePurposeOutage());
        outageMasterDTO.setCdeWeatherConditions(outageMaster.getCdeWeatherConditions());

        outageMasterDTO.setCircuit(outageMaster.getCircuit());
        outageMasterDTO.setDevice(outageMaster.getDevice());
        outageMasterDTO.setDeviceNumber(outageMaster.getDeviceNumber());

        outageMasterDTO.setNumberCustomers(outageMaster.getNumberCustomers());
        outageMasterDTO.setQtyPhases(outageMaster.getQtyPhases());
        outageMasterDTO.setCdsExcludeForArp(outageMaster.getCdsExcludeForArp());

        outageMasterDTO.setRemarks(outageMaster.getRemarks());

        return outageMasterDTO;
    }

    private OutageMaster mapToEntity(OutageMasterDTO outageMasterDTO){
        OutageMaster outageMaster = new OutageMaster();

        outageMaster.setDateTimeOff(outageMasterDTO.getDateTimeOff());
        outageMaster.setDateModified(outageMasterDTO.getDateModified());

        outageMaster.setCdeCauseOutage(outageMasterDTO.getCdeCauseOutage());
        outageMaster.setCdePurposeOutage(outageMasterDTO.getCdePurposeOutage());
        outageMaster.setCdeWeatherConditions(outageMasterDTO.getCdeWeatherConditions());

        outageMaster.setServerCentre(outageMasterDTO.getServerCentre());
        outageMaster.setTown(outageMasterDTO.getTown());
        outageMaster.setStreet(outageMasterDTO.getStreet());
        outageMaster.setPole(outageMasterDTO.getPole());
        outageMaster.setAlt(outageMasterDTO.getAlt());

        outageMaster.setCircuit(outageMasterDTO.getCircuit());
        outageMaster.setDevice(outageMasterDTO.getDevice());
        outageMaster.setDeviceNumber(outageMasterDTO.getDeviceNumber());

        outageMaster.setNumberCustomers(outageMasterDTO.getNumberCustomers());
        outageMaster.setQtyPhases(outageMasterDTO.getQtyPhases());
        outageMaster.setCdsExcludeForArp(outageMasterDTO.getCdsExcludeForArp());

        outageMaster.setRemarks(outageMasterDTO.getRemarks());

        return outageMaster;
    }
}
