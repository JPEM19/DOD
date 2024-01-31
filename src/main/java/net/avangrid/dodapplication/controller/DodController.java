package net.avangrid.dodapplication.controller;

import net.avangrid.dodapplication.payload.OutageDetailDTO;
import net.avangrid.dodapplication.payload.OutageMasterDTO;
import net.avangrid.dodapplication.service.OutageDetailService;
import net.avangrid.dodapplication.service.OutageMasterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/dod")
public class DodController {
    private OutageMasterService outageMasterService;
    private OutageDetailService outageDetailService;
    public DodController(OutageMasterService outageMasterService, OutageDetailService outageDetailService) {
        this.outageMasterService = outageMasterService;
        this.outageDetailService = outageDetailService;
    }

    //@PreAuthorize("hasRole('admin')")
    @PostMapping("/create")
    public ResponseEntity<OutageMasterDTO> createOutageMaster(@RequestBody OutageMasterDTO outageMasterDTO){
        return new ResponseEntity<>(outageMasterService.createOutageMaster(outageMasterDTO), HttpStatus.CREATED);
    }

    @PostMapping("/create/detail/{id}")
    public ResponseEntity<OutageDetailDTO> createOutageDetail(@PathVariable long id, @RequestBody OutageDetailDTO outageDetailDTO){
        return new ResponseEntity<>(outageDetailService.createOutageDetail(id, outageDetailDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OutageMasterDTO>> getAllOutageMaster(){
        return new ResponseEntity<>(outageMasterService.getAllOutageMaster(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<OutageMasterDTO> getById(@PathVariable long id){
        return new ResponseEntity<>(outageMasterService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id){
        outageMasterService.deleteById(id);
        return new ResponseEntity<>("Outage reported successfully deleted", HttpStatus.OK);
    }

}
