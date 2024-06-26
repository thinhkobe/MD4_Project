package ra.md4_project.service.userService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ra.md4_project.exception.DataNotFound;
import ra.md4_project.model.dto.request.FormLogin;
import ra.md4_project.model.dto.request.FormRegister;
import ra.md4_project.model.dto.response.JWTResponese;
import ra.md4_project.model.entity.Users;

import java.util.List;

public interface IUserService {
    boolean register(FormRegister formRegister);
    JWTResponese login(FormLogin formLogin) throws DataNotFound;

    Page<Users> findAll(Pageable pageable);
    Users findById(Long id) throws DataNotFound;
    Users changeUserStatusByUserId(Long userId) throws DataNotFound;

    List<Users> searchUserByName(String name);
}
