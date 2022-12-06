package beans;
import java.util.ArrayList;
import java.util.List;

public final class Saltos extends Contas{
	private int f;
	private int g;
	private int h;
	private List<Integer> a = new ArrayList<>();
	
	public void setF(int f) {
		this.f = f;
	}
	public void setG(int g) {
		this.g = g;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Saltos(int f, int g, int h) {
		this.f = f;
		this.g = g;
		this.h = h;
	}
	public Saltos(/*int f, int g, int h*/) {/*
		this.f = f;
		this.g = g;
		this.h = h;*/
	}
	public List<Integer> intervalo() {
		a = range(f, g);
		return a;
	}
	public List<Integer> intervalo(int f, int g) {
		a = range(f, g);
		return a;
	}
	public List<Integer> intervaloComSalto() {
		a = rangeSkip(f, g, h);
		return a;
	}
	public List<Integer> intervaloComSalto(int f, int g, int h) {
		a = rangeSkip(f, g, h);
		return a;
	}
	public List<Integer> intervaloInverso() {
		a = range(f, g);
		return a;
	}
	public List<Integer> intervaloInverso(int f, int g) {
		a = rangeRetro(f, g);
		return a;
	}
	public List<Integer> intervaloInversoComSalto() {
		a = rangeSkip(f, g, h);
		return a;
	}
	public List<Integer> intervaloInversoComSalto(int f, int g, int h) {
		a = rangeSkipRetro(f, g, h);
		return a;
	}
	public void printSalto() {
		
	}
	
}
