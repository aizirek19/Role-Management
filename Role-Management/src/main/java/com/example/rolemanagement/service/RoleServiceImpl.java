//package com.example.rolemanagement.service;
//import com.example.rolemanagement.dto.RoleDTO;
//import com.example.rolemanagement.entity.Role;
//import com.example.rolemanagement.repository.RoleRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class RoleServiceImpl implements RoleService {
//
//    private final RoleRepository roleRepository;
//
//    @Override
//    public RoleDTO createRole(RoleDTO roleDTO) {
//        Role role = mapToEntity(roleDTO);
//        Role savedRole = roleRepository.save(role);
//        return mapToDTO(savedRole);
//    }
//
//    @Override
//    public RoleDTO getRoleById(Long id) {
//        Role role = roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role not found"));
//        return mapToDTO(role);
//    }
//
//    @Override
//    public List<RoleDTO> getAllRoles() {
//        return roleRepository.findAll().stream()
//                .map(this::mapToDTO)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public RoleDTO updateRole(Long id, RoleDTO roleDTO) {
//        Role role = roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role not found"));
//        role.setName(roleDTO.getName());
//        Role updatedRole = roleRepository.save(role);
//        return mapToDTO(updatedRole);
//    }
//
//    @Override
//    public void deleteRole(Long id) {
//
//        roleRepository.deleteById(id);
//    }

//    private RoleDTO mapToDTO(Role role) {
//        RoleDTO roleDTO = new RoleDTO();
//        roleDTO.setId(role.getId());
//        roleDTO.setName(role.getName());
//        return roleDTO;
//    }

//}
