package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        List<EmployeeDb> emps = obj.initEmp();

    }

    List<EmployeeDb> initEmp(){
        List<EmployeeDb> list = new ArrayList<>();
        list.add(new EmployeeDb(1,"rama","1234567890", Arrays.asList("java dev","project lead"),(double)50000));
        list.add(new EmployeeDb(2,"sama","1234567891", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(3,"dama","1234567892", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(4,"cama","1234567893", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(5,"vama","1234567894", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(6,"nama","1234567895", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(7,"gama","1234567896", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(8,"pama","1234567897", Arrays.asList("java dev","codder","marketing"),(double)40000));
        list.add(new EmployeeDb(9,"jama","1234567898", Arrays.asList("java dev","codder"),(double)30000));
        list.add(new EmployeeDb(10,"bama","1234567899", Arrays.asList("java dev","codinator"),(double)30000));
        list.add(new EmployeeDb(11,"lulu","1234567810", Arrays.asList("java dev","lead","manager"),(double)60000));
        list.add(new EmployeeDb(12,"bulu","1234567811", Arrays.asList("java dev"),(double)35000));
        list.add(new EmployeeDb(13,"gitu","1234567812", Arrays.asList("java dev"),(double)36000));
        list.add(new EmployeeDb(14,"mama","1234567813", Arrays.asList("java dev"),(double)31000));


        return list;
    }
}
