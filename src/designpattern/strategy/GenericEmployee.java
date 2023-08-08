package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:27:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericEmployee extends CompanyMember {
    private NumberValidationStrategy salaryValidationStrategy, monthSpentStrategy;
    private StringValidationStrategy nameValidationStrategy;

    public void setNameValidationStrategy(StringValidationStrategy validationStrategy){
        this.nameValidationStrategy =validationStrategy;
    }

    public void setSalaryValidationStrategy(NumberValidationStrategy validationStrategy){
        this.salaryValidationStrategy =validationStrategy;
    }
    public void setSalary(int salary) {
        super.setSalary(salary);
        salaryValidationStrategy.validate(salary, 1000);
//        atMost(salary, 1000);
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
//        notEmpty(name);
        nameValidationStrategy.validate(name,name.length());
        this.mgrName = name;
    }

    public void setMonthsSpent(int months) {
//        atLeast(months, 0);
        monthSpentStrategy.validate(months,0);
    }
}
