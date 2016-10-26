package inventorymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventorymanagement.dao.RoleDaoInterface;
import inventorymanagement.entities.Role;

@Service
public class RoleServiceImpl implements RoleServiceInterface {

	@Autowired
	RoleDaoInterface roleDaoImpl;

	@Override
	public List<Role> getAllRoles() {

		return roleDaoImpl.getAll();
	}

}