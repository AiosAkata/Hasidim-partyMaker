package hasidim.partyMaker.repository;

import hasidim.partyMaker.jpa.HasidimRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HasidimRoleRepository extends JpaRepository<HasidimRole,Integer> {
    List<HasidimRole> findAllByRoleNameLikeAndShortNameLike(String RoleName, String ShortName);
}
