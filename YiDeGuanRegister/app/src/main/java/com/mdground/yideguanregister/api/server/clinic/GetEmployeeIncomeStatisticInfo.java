package com.mdground.yideguanregister.api.server.clinic;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.mdground.yideguanregister.api.base.ClinicRequest;
import com.mdground.yideguanregister.api.base.RequestCallBack;
import com.mdground.yideguanregister.api.base.RequestData;

public class GetEmployeeIncomeStatisticInfo extends ClinicRequest {
	private static final String FUNCTION_NAME = "GetEmployeeIncomeStatisticInfo";

	public GetEmployeeIncomeStatisticInfo(Context context) {
		super(context);
	}

	@Override
	protected String getFunctionName() {
		return FUNCTION_NAME;
	}

	public void getEmployeeIncomeStatisticInfo(int employeeID, RequestCallBack callBack) {
		setRequestCallBack(callBack);

		JSONObject obj = new JSONObject();
		try {
			obj.put("EmployeeID", String.valueOf(employeeID));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		RequestData data = getData();
		data.setQueryData(obj.toString());
		pocess();
	}

}
