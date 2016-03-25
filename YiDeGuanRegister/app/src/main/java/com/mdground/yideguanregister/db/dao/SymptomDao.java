package com.mdground.yideguanregister.db.dao;

import java.util.List;

import android.content.Context;

import com.mdground.yideguanregister.bean.Symptom;
import com.mdground.yideguanregister.db.dao.inter.ISymptom;

public class SymptomDao extends GenericsDao<Symptom> implements ISymptom {

	private static SymptomDao instance = null;

	protected SymptomDao(Context context) {
		super(context);
	}

	public static SymptomDao getInstance(Context context) {
		if (instance == null) {
			instance = new SymptomDao(context);
		}

		return instance;
	}

	@Override
	public void saveSymptoms(List<Symptom> symptoms) {
		if (symptoms == null) {
			return;
		}

		for (int i = 0; i < symptoms.size(); i++) {
			save(symptoms.get(i));
		}
	}

	@Override
	public List<Symptom> getSymptoms() {
		return getDb().findAll(Symptom.class);

	}

	@Override
	public void deleteAll() {
		getDb().deleteAll(Symptom.class);
	}

}
