package pgdp.trains;

public class Train {


    public Locomotive locomotive;//属性 Attribut

    public Carriage[] carriages;//属性 Attribut


    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;//属性 Attribut,参数 Parameter
    }


    public Carriage[] getCarriages() {
        return carriages;//属性 Attribut
    }


    public Locomotive getLocomotive() {
        return locomotive;//属性Attribut
    }

    public void setLocomotive(Locomotive locomotive) {//参数 Parameter
        this.locomotive = locomotive;//属性 Attribut,参数 Parameter
    }

    public void setCarriages(Carriage[] carriages) {
        this.carriages = carriages;
    }

    public int getTotalWeight() {
        for (int i = 0; i < carriages.length; i++) {

        }
        return 0;
    }

    public int getNumberOfPassengers() {
        //遍历carriages数组:
        //1.carriage ->person.length
        int number = 0;
        for (int i = 0; i < carriages.length; i++) {
            number += carriages[i].getPassengers().length;
        }
        return number;
    }

    public void appendCarriage(Carriage append){
        //创建新数组
        // 获得新数组长度carriages.length+1
        //复制原数组到新数组
        // 添加append车厢到新数组最后一位
        //替换原数组
        Carriage[] carriageNew=new Carriage[carriages.length+1];
        for (int i = 0; i <carriages.length; i++) {
            carriageNew[i]=carriages[i];
        }
        carriageNew[carriageNew.length-1]=append;
        carriages=carriageNew;
    }
}
