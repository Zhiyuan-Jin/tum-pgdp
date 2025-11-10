package pgdp.io;

import java.io.*;

public class PenguinRepository implements Repository<Penguin> {
    @Override
    public void save(Penguin p, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            bw.write(p.name() + "\n");
            bw.write(p.age() + "\n");
            bw.write(p.weight() + "\n");
        } catch (IOException e) {
            System.out.println("Error while saving penguin to file");
            throw new RuntimeException();
        }
    }

    @Override
    public Penguin load(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            //按顺序读：
            String name = br.readLine(); //读第一行name
            int age = Integer.parseInt((br.readLine())); //读第二行age
            double weight = Double.parseDouble((br.readLine())); //读第三行weight

            return new Penguin(name, age, weight);

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
