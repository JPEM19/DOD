package net.avangrid.dodapplication.controller;

import net.avangrid.dodapplication.payload.OutageMasterDTO;
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
    public DodController(OutageMasterService outageMasterService) {
        this.outageMasterService = outageMasterService;
    }

    //@PreAuthorize("hasRole('admin')")
    @PostMapping("/create")
    public ResponseEntity<OutageMasterDTO> createOutageMaster(@RequestBody OutageMasterDTO outageMasterDTO){
        return new ResponseEntity<>(outageMasterService.createOutageMaster(outageMasterDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OutageMasterDTO>> getAllOutageMaster(){
        return new ResponseEntity<>(outageMasterService.getAllOutageMaster(), HttpStatus.OK);
    }

}
