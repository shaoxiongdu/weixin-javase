package question1.info;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 14:41
 * @description: 商品详细信息 类
 */
public class ProductDetal {

    //商品id
    private int productId;

    //商品名称
    private String name;

    //类别id
    private String productType;

    //商品数量
    private int count;

    //价格
    private double price;

    public ProductDetal() {
    }

    //全参构造
    public ProductDetal(int productId, String name, String productType, int count, double price) {
        this.productId = productId;
        this.name = name;
        this.productType = productType;
        //带校验的设置
        setCount(count);
        setPrice(price);
    }


    //设置数量
    public void setCount(int count) {
        if(count < 0) {
            return;
        }
        this.count = count;
    }

    //设置价格
    public void setPrice(double price) {
        if(price < 0) {
            return;
        }
        this.price = price;
    }

    /**
     * 盘点方法
     */
    public void inventory(){
        if(count == 0) {
            System.out.println("库存数量异常，请练习管理员!");
        }
        System.out.println("商品名称: " + name);
        System.out.println("所属类别: " + productType);
        System.out.println("商品售价: " + price);
        System.out.println("库存数量: " + count);
        System.out.println("商品总价: " + getTotalPrice());
        System.out.println("===================================");
    }

    /**
     * 返回总价
     * @return
     */
    private double getTotalPrice(){
        return this.count * this.price;
    }


    //////////////////////////////////   set / get方法  //////////////////////////////////

    public double getPrice() {
        return price;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getProductType() {
        return productType;
    }

    public void setProductType(String  productType) {
        this.productType = productType;
    }

    public int getCount() {

        return count;
    }

}
