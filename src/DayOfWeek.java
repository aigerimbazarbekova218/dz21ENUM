public enum DayOfWeek {
    MONDAY("Дуйшомбу"){
        @Override
        void dayofweek() {
            System.out.println("Дуйшомбу куну жава сабак окуйм");
        }
    },


    TUESDAY("Шейшемби"){
        @Override
        void dayofweek() {
            System.out.println("Шейшемби куну англис тилин окуйм");
        }
    },
    WEDNESDAY("Шаршемби"){
        @Override
        void dayofweek() {
            System.out.println("Шаршемби куну практикалык сабак болот");
        }
    },
    THURSDAY("Бейшемби"){
        @Override
        void dayofweek() {
            System.out.println("Бейшемби - теориялык сабак болот");
        }
    },
    FRIDAY("Жума"){
        @Override
        void dayofweek() {
            System.out.println("Жума куну - орус тилин уйронууго барам");
        }
    },
    SATURDAY("Ишемби"){
        @Override
        void dayofweek() {
            System.out.println("Ишеби куну - спорт менен машыгамын ");
        }
    },
    SUNDAY("Жекшемби"){
        @Override
        void dayofweek() {
            System.out.println("Жекшемби сабак жок");
        }
    };
    DayOfWeek (String kyrgyzcha){
    }
    abstract void dayofweek();


}
