package hasidim.partyMaker.Services;

import hasidim.partyMaker.jpa.HasidimRole;
import hasidim.partyMaker.repository.HasidimRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HasidimRoleService {
    @Autowired
    private HasidimRoleRepository hasidimRoleRepository;

    public List<HasidimRole> getAll(){
        return hasidimRoleRepository.findAll(Sort.by(Sort.Direction.ASC,"roleName"));
    }
}
