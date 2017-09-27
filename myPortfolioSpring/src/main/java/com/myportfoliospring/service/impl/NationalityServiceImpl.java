/**
 * 
 */
package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myportfoliospring.enums.NationalityEnum;
import com.myportfoliospring.model.NationalityModel;
import com.myportfoliospring.service.NationalityService;

/**
 * @author Omar
 *
 */

@Service("nationalityService")
public class NationalityServiceImpl implements NationalityService {

	@Override
	public List<NationalityModel> listNationality() {

		List<NationalityModel> nationalityModels = new ArrayList<NationalityModel>();

		for (NationalityEnum ne : NationalityEnum.values()) {

			NationalityModel nationalityModel = new NationalityModel();
			nationalityModel.setIdNationality(ne.getIdNationality());
			nationalityModel.setDescNationality(ne.getDescNationality());

			nationalityModels.add(nationalityModel);
		}

		return nationalityModels;
	}

}
