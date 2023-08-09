package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class Adapter implements LeaveRecord{

    @Override
    public String getMostAbsentEmployee() {
        ThirdPartyLeaveRecord leaveRecord = new ThirdPartyLeaveRecord();
        Employee mostAbsentEmployee= leaveRecord.getMostAbsentEmployee();
        return mostAbsentEmployee.getName();

//        return null;
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        ThirdPartyLeaveRecord leaveRecord=new ThirdPartyLeaveRecord();
        Employee employee =new Employee(employeeName);
        return leaveRecord.getEmployeeAbsences(employee);

    }
}
