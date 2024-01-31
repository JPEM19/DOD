package net.avangrid.dodapplication.service;

import net.avangrid.dodapplication.payload.OutageDetailDTO;

public interface OutageDetailService {
    OutageDetailDTO createOutageDetail(long idOutage, OutageDetailDTO outageDetailDTO);
}
