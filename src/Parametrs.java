import java.util.Scanner;

public class Parametrs {
	private double air_temp; // ����������� �������
	private double air_hum; // ��������� �������
	private double conc_co2; // ������������ CO2
	private int brightness; // ������� �����
	private int light; // ���������/���������� �����
	private int vent_speed; // �������� ����������

	private static Parametrs lastPar;
	private Parametrs prev;
	private Parametrs next;

	// �����������
	public Parametrs() {
		air_temp = 0;
		air_hum = 0;
		conc_co2 = 0;
		brightness = 0;
		light = 0;
		vent_speed = 0;
	}

	// ����������� � ����� ����������
	public Parametrs(double temp) {
		air_temp = temp;
		air_hum = 0;
		conc_co2 = 0;
		brightness = 0;
		light = 0;
		vent_speed = 0;
	}

	// ����������� � �����������
	public Parametrs(double temp, double hum, double co2, int bright, int l, int speed) {
		air_temp = temp;
		air_hum = hum;
		conc_co2 = co2;
		brightness = bright;
		light = l;
		vent_speed = speed;
	}

	// ������� ��������� ������ �� �����
	public double Get_air_temp() {
		return this.air_temp;
	}

	public double Get_air_hum() {
		return this.air_hum;
	}

	public double Get_conc_co2() {
		return this.conc_co2;
	}

	public int Get_brightness() {
		return this.brightness;
	}

	public int Get_light() {
		return this.light;
	}

	public int Get_vent_speed() {
		return this.vent_speed;
	}

	// ������� ������� �����
	public void Set_air_temp(double temp) {
		this.air_temp = temp;
	}

	public void Set_air_hum(double hum) {
		this.air_hum = hum;
	}

	public void Set_conc_co2(double co2) {
		this.conc_co2 = co2;
	}

	public void Set_brightness(int bright) {
		this.brightness = bright;
	}

	public void Set_light(int l) {
		this.light = l;
	}

	public void Set_vent_speed(int speed) {
		this.vent_speed = speed;
	}

	// ������� ����� ������ ���������
	public void Set_parametrs(double temp, double hum, double co2, int bright, int l, int speed) {
		this.air_temp = temp;
		this.air_hum = hum;
		this.conc_co2 = co2;
		this.brightness = bright;
		this.light = l;
		this.vent_speed = speed;
	}

	// ����� ���������� �� �����
	public void Display() {
		String os = System.getProperty("os.name");
		String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		Scanner in = new Scanner(System.in, consoleEncoding);

		System.out.println("\n���������� ������� � �������: " + air_temp + " ��");
		System.out.println("��������� ������� � �������: " + air_hum + " %");
		System.out.println("������������ CO2 � �������: " + conc_co2 + " %");
		System.out.println("������� ����� � �������: " + brightness + " %");
		System.out.println("������ ����� � �������: " + light);
		System.out.println("�������� ���������� � �������: " + vent_speed + " %");
	}

	// ����� ������
	public void NewList() {
		lastPar = null;
	}

	// ���������� �������� � ����� ������
	public void Add() {
		if (lastPar == null)
			this.prev = null;
		else {
			lastPar.next = this;
			prev = lastPar;
		}
		lastPar = this;
		this.next = null;
	}

	// ����� �� ������� ����������� ������
	public void reprint() {
		Parametrs uk; // ��������������� ������
		uk = lastPar;
		if (uk == null) {
			System.out.println("������ ����!");
			return;
		} else
			System.out.println("\n���������� ������:");
		// ���� ������ � �������� ������� �������� ��������� ������:
		while (uk != null) {
			System.out.println(uk.vent_speed + "\t");
			uk = uk.prev;
		}
	}
}
