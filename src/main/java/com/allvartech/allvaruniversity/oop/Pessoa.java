package com.allvartech.allvaruniversity.oop;

public class Pessoa {
private int idade;
private double altura;
private char sexo;
private long cpf;
private boolean ativo;

//Getters e Setters
public int getIdade() { return idade; }
public void setIdade(int idade) { this.idade = idade; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public long getCpf() { return cpf; }
    public void setCpf(long cpf) { this.cpf = cpf; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

// Metodo para gerar valores aleatórios
  public void gerarValoresAleatorios() {
     Random random = new Random();

      this.idade = random.nextInt(100); // 0 a 99
      this.altura = 1.5 + (random.nextDouble() * 1.0); // entre 1.5 e 2.5
      this.sexo = random.nextBoolean() ? 'M' : 'F';
      this.cpf = 10000000000L + (Math.abs(Random.nextLong()) % 99999999999L);
      this.ativo = random.nextBoolean();
   }
}
