package com.bootdo.clouddoadmin.service;

import com.bootdo.clouddoadmin.domain.Tree;
import com.bootdo.clouddoadmin.domain.DeptDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 *
 * @author chglee
 * @email
 * @date 2017-09-27 14:28:36
 */
@Service
public interface DeptService {

	DeptDO get(Long deptId);

	List<DeptDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DeptDO sysDept);

	int update(DeptDO sysDept);

	int remove(Long deptId);

	int batchRemove(Long[] deptIds);

	Tree<DeptDO> getTree();

	boolean checkDeptHasUser(Long deptId);
}
