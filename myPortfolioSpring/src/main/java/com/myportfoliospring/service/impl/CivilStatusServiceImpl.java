package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myportfoliospring.enums.CivilStatusEnum;
import com.myportfoliospring.model.CivilStatusModel;
import com.myportfoliospring.service.CivilStatusService;

@Service("civilStatusService")
public class CivilStatusServiceImpl implements CivilStatusService {

	@Override
	public List<CivilStatusModel> listCivilStatus() {

		List<CivilStatusModel> listCivilStatus = new ArrayList<>();

		for (CivilStatusEnum cse : CivilStatusEnum.values()) {
			
			CivilStatusModel civilStatusModel = new CivilStatusModel(); 
			civilStatusModel.setIdStatus(cse.getIdStatus());
			civilStatusModel.setDescStatus(cse.getDescStatus());
			
			listCivilStatus.add(civilStatusModel);

		}

		return listCivilStatus;
	}

}
