package question1.info;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 14:40
 * @description: 商品类别 类
 */
public class ProductType {

    //类别id
    private int typeId;

    //类别名称
    private String name;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType() {
    }

    public ProductType(int id, String name) {
        this.typeId = id;
        this.name = name;
    }
}
