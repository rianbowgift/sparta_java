class Mineral{

}

class Gold extends Mineral{
}

class Silver extends Mineral{
}

class Bronze extends Mineral{
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral Mineral){
        if(Mineral.getClass()==Gold.class){
            this.value += 100;
        }else if(Mineral.getClass()==Silver.class){
            this.value += 90;
        }else if(Mineral.getClass()==Bronze.class){
            this.value += 80;
        }

    }



    public int getValue() {
        return this.value;
    }
}

