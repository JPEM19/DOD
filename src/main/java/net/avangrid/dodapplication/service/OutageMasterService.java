package net.avangrid.dodapplication.service;

import net.avangrid.dodapplication.payload.OutageMasterDTO;

import java.util.List;

public interface OutageMasterService {
    OutageMasterDTO createOutageMaster(OutageMasterDTO outageMasterDTO);
    List<OutageMasterDTO> getAllOutageMaster();
    OutageMasterDTO getById(long id);
    void deleteById(long id);
}
