package entities;

public class Employee {

    private String nome;
    private Integer id;
    private Double salary;

    public Employee(Integer id, String nome, Double salary){
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += (salary * percentage/100);
    }
    
    @Override
    public String toString(){
        return id + ", " + nome + ", " + String.format("%.2f", salary);
    }
}
