package hw9;

public class EmpUtils {
    
    private EmpUtils() {
    }

    //    поиск сотрудника в массиве по его имени
    public static Employee findByName(Employee[] group, String name) {
        if (group == null || name == null) {
            return null;
        }
        for (Employee employee : group) {
            if (employee != null && name.equals(employee.getName())) {
                return employee;
            }
        }
        return null;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findByNameSubString(Employee [] group, String str){
        if (str == null || group == null){
            return null;
        }
        for(Employee person : group){
            if(person != null && person.getName() != null && person.getName().contains(str)) {
                return person;
            }
        }
        return null;
    }

//    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int findSalaryBudget(Employee [] group){
        if (group == null){
            return 0;
        }
        int salaryBudget = 0;
        for(Employee person : group){
            if(person == null && person.getSalary() != 0){
                continue;
            }
            salaryBudget += person.getSalary();
        }
        return salaryBudget;
    }

//    поиск наименьшей зарплаты в массиве
    public static int findLowestSalary(Employee [] group){
        if(group == null || group.length == 0){
            return 0;
        }
        int lowestSalary = Integer.MAX_VALUE;
        for(Employee person : group){
            if(person != null) {
                if (person.getSalary() < lowestSalary) {
                    lowestSalary = person.getSalary();
                }
            }
        }
        return lowestSalary;
    }

//    поиск наибольшей зарплаты в массиве
    public static int findLargestSalary(Employee[] group){
        if(group == null || group.length == 0){
            return 0;
        }
        int largestSalary = Integer.MIN_VALUE;
        for(Employee person : group){
            if(person != null){
                if(person.getSalary() > largestSalary){
                    largestSalary = person.getSalary();
                }
            }
        }
        return largestSalary;
    }

//    поиск наименьшего количества подчиненных в массиве менеджеров
    public static int findLowestNumberOfSubordinates(Manager[] group){
        if(group == null || group.length == 0){
            return 0;
        }
        int lowestNumberOfSubordinates = Integer.MAX_VALUE;
        for(Manager person : group){
            if(person != null && lowestNumberOfSubordinates > person.getNumberOfSubordinates()){
                lowestNumberOfSubordinates = person.getNumberOfSubordinates();
            }
        }
        return lowestNumberOfSubordinates;
    }

//    поиск наибольшего количества подчиненных в массиве менеджеров
    public static int findLargestNumberOfSubordinates(Manager[] group){
        if(group == null || group.length == 0){
            return 0;
        }
        int largestNumberOfSubordinates = Integer.MIN_VALUE;
        for(Manager person : group){
            if(person != null && person.getNumberOfSubordinates() > largestNumberOfSubordinates){
                largestNumberOfSubordinates = person.getNumberOfSubordinates();
            }
        }
        return largestNumberOfSubordinates;
    }

//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой в массиве менеджеров
    public static int findLargestAllowance(Manager[] group){
        if(group == null || group.length == 0){
            return 0;
        }
        int allowance = 0;
        for(Manager person : group){
            if(person != null && person.getSalary() - person.getBaseSalary() > allowance){
                allowance = person.getSalary() - person.getBaseSalary();
            }
        }
        return allowance;
    }

//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массив
    public static int findLowestAllowance(Manager[] group){
        if(group == null || group.length == 0){
            return 0;
        }
        int allowance = Integer.MAX_VALUE;
        for(Manager person : group){
            if(person != null && person.getSalary() - person.getBaseSalary() < allowance){
                allowance = person.getSalary() - person.getBaseSalary();
            }
        }
        return allowance;
}
}
