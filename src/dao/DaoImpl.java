package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {

        //je me connecte a la bd
        double data = 92;
        return data;
    }
}