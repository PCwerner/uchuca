package uchuca.persistence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uchuca.domain.Usuario;
import uchuca.persistence.entity.TbUser;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUsuario",target = "id"),
            @Mapping(source = "usuEdad",target = "edad"),
            @Mapping(source = "usuEmail",target = "correo"),
            @Mapping(source = "usoContra",target = "constrasena"),
            @Mapping(source = "usuNombre",target = "nombre"),
            @Mapping(source = "usuApellido",target = "apellido"),
            @Mapping(source = "usuPerfil",target = "perfil"),
            @Mapping(source = "usuPortada",target = "portada"),
            @Mapping(source = "idDepartamento",target = "idDepartamento"),
            @Mapping(source = "idTipoUsuario",target = "idTipoUsuario")
    })
    Usuario toUsuario (TbUser tbUser);
    List<Usuario> toUsuarios (List<TbUser> tbUsers);
    @InheritInverseConfiguration
    TbUser toTbUser (Usuario usuario);

}
