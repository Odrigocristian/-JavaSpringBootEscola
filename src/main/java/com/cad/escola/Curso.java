package com.cad.escola;

public class Curso {
	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public String getDataVigente() {
		return DataVigente;
	}

	public void setDataVigente(String dataVigente) {
		DataVigente = dataVigente;
	}

	public double getValorHoraInstrutor() {
		return ValorHoraInstrutor;
	}

	public void setValorHoraInstrutor(double valorHoraInstrutor) {
		ValorHoraInstrutor = valorHoraInstrutor;
	}

	public String getPrograma() {
		return Programa;
	}

	public void setPrograma(String programa) {
		Programa = programa;
	}

	private String Sigla;
	private String Nome;
	private int CargaHoraria;
	private double Valor;
	private String DataVigente;
	private double ValorHoraInstrutor;
	private String Programa;

	public Curso(String sigla, String nome) {
		super();
		Sigla = sigla;
		Nome = nome;
	}

	public String getSigla() {
		return Sigla;
	}

	public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
