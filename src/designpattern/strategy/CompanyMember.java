package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    private StringValidationStrategy nameValidationStrategy;
    private NumberValidationStrategy salaryValidationStrategy;

    public void setNameValidationStrategy(StringValidationStrategy validationStrategy){
        this.nameValidationStrategy =validationStrategy;
    }

    public void setSalaryValidationStrategy(NumberValidationStrategy validationStrategy){
        this.salaryValidationStrategy =validationStrategy;
    }

    public void setName(String name) {
        nameValidationStrategy.validate(name, 50);
        this.name = name;
    }

    public void setSalary(int salary) {
        salaryValidationStrategy.validate(salary, 1);
    }

    public void setManagerName(String name) {
        nameValidationStrategy.validate(name, 50);
    }
}
