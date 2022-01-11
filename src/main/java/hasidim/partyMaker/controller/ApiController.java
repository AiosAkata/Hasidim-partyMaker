package hasidim.partyMaker.controller;

import hasidim.partyMaker.Services.HasidimRoleService;
import hasidim.partyMaker.jpa.HasidimRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private HasidimRoleService hasidimRoleService;

    @RequestMapping("/get/roles")
    public ResponseEntity<Object> getRoles(){
        List<HasidimRole> hasidimRoles = hasidimRoleService.getAll();;
        return new ResponseEntity<>(hasidimRoles, HttpStatus.OK);
    }

    
}
