package com.javancnhom15.JavaNcNhom15.utilities;

import com.javancnhom15.JavaNcNhom15.dto.UserDTO;
import com.javancnhom15.JavaNcNhom15.entity.User;

public class ConvertUserToDto {

    public static UserDTO convertUsertoDto(User user) {
        return new UserDTO(user.getId(),user.getUsername(), user.getHo_ten(), user.getSdt(), user.getGioi_tinh(), user.getEmail(),
                user.getDia_chi(), user.getRole());
    }

}
