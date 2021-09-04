package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:02
 * @description: 主人类
 */
public class Owner {

    private String name;

    /**
     * 领养宠物
     * @param type 1 狗  2 企鹅
     * @return
     */
    public Pet getPet(int type){

        Pet pet = null;

        switch (type){
            case 1 :
                pet = new Dog(200,"旺财",200);
                break;
            case 2 :
                pet = new Penguin(100,"QQ仔",100);
                break;
        }
        return pet;
    }

    public void play(Pet pet){
      pet.play(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner(String name) {
        this.name = name;
    }
}
