package Abstractfactory;

public class MaterialFactory extends AbstractFactory {




    @Override
    public Material getMaterial(String materialName) {
        if(materialName.equals("FABRIC")) {
            return new Fabric();
        }

        if(materialName.equals("PLASTIC")) {
            return new Plastic();
        }
        System.out.println("Unknown material");
        return null;
    }
}