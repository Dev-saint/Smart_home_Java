import java.util.Scanner;
import java.lang.*;

public class Smart_home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String os = System.getProperty("os.name");
		String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		Scanner in = new Scanner(System.in, consoleEncoding);

		double t, co2, hum;
		int f_menu_rooms = 0, room, par, f_menu_par = 0, bright, speed, light, coffee, water;
		Toilet toil = new Toilet();
		Kitchen kitch = new Kitchen();
		Bedroom bed = new Bedroom();
		Bathroom bath = new Bathroom();
		Wine_vault wine = new Wine_vault();
		System.out.println("Система умного дома");
		do {
			System.out.println("Выберите комнату:\n" + "1. Туалет\n" + "2. Кухня\n" + "3. Спальня\n" + "4. Ванная\n"
					+ "5. Винный погреб\n" + "Выбранная комната: ");
			room = in.nextInt();
			if (room == 1)
				do {
					toil.menu_toil();
					par = in.nextInt();
					if (par == 1) {
						System.out.print("\nВведите желаемую температуру воздуха (в °С): ");
						t = in.nextDouble();
						toil.Set_air_temp_toil(t);
						System.out.println(
								"Температура воздуха в туалете будет изменена до " + toil.Get_air_temp_toil() + " °С");
					} else if (par == 2) {
						System.out.print("\nВведите желаемую влажность воздуха (в %): ");
						hum = in.nextDouble();
						toil.Set_air_hum_toil(hum);
						System.out.println(
								"Влажность воздуха в туалете будет изменена до " + toil.Get_air_hum_toil() + " %");
					} else if (par == 3) {
						System.out.print("\nВведите желаемую концентрацию CO2 (в %): ");
						co2 = in.nextDouble();
						toil.Set_conc_co2_toil(co2);
						System.out.println(
								"Концентрация CO2 в туалете будет изменена до " + toil.Get_conc_co2_toil() + " %");
					} else if (par == 4) {
						System.out.print("\nВведите желаемую яркость света (в %): ");
						bright = in.nextInt();
						toil.Set_brightness_toil(bright);
						System.out.println("Яркость в туалете будет изменена до " + toil.Get_brightness_toil() + " %");
					} else if (par == 5) {
						System.out.println("\nВключить (1) или выключить (0) свет?");
						light = in.nextInt();
						if (light == 1 && toil.Get_light_toil() != 1) {
							toil.Set_light_toil(light);
							System.out.println("Свет в туалете включен");
						} else if (light == 1) {
							System.out.println("\nСвет уже включен. Выключить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								toil.Set_light_toil(light);
								System.out.println("Свет в туалете выключен");
							}
						} else if (toil.Get_light_toil() == 0) {
							System.out.println("\nСвет уже выключен. Включить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								toil.Set_light_toil(light);
								System.out.println("Свет в туалете включен");
							}
						} else {
							toil.Set_light_toil(light);
							System.out.println("Свет в туалете выключен ");
						}
					} else if (par == 6) {
						System.out.print("\nВведите желаемую скорость вентиляции: ");
						speed = in.nextInt();
						toil.Set_vent_speed_toil(speed);
						System.out.println(
								"Скорость вентиляции в туалете будет изменена до " + toil.Get_brightness_toil() + " %");
					} else {
						System.out.println("\nВыберите пункт из предложенных!");
					}
					System.out.println("\nЖелаете выбрать еще один параметр? Да(1)/Нет(0)");
					f_menu_par = in.nextInt();
				} while (f_menu_par == 1);
			else if (room == 2)
				do {
					kitch.menu_kitch();
					par = in.nextInt();
					if (par == 1) {
						System.out.print("\nВведите желаемую температуру воздуха (в °С): ");
						t = in.nextDouble();
						;
						kitch.Set_air_temp_kitch(t);
						System.out.println(
								"Температура воздуха на кухне будет изменена до " + kitch.Get_air_temp_kitch() + " °С");
					} else if (par == 2) {
						System.out.print("\nВведите желаемую влажность воздуха (в %): ");
						hum = in.nextDouble();
						kitch.Set_air_hum_kitch(hum);
						System.out.println(
								"Влажность воздуха на кухне будет изменена до " + kitch.Get_air_hum_kitch() + " %");
					} else if (par == 3) {
						System.out.print("\nВведите желаемую концентрацию CO2 (в %): ");
						co2 = in.nextDouble();
						kitch.Set_conc_co2_kitch(co2);
						System.out.println(
								"Концентрация CO2 на кухне будет изменена до " + kitch.Get_conc_co2_kitch() + " %");
					} else if (par == 4) {
						System.out.print("\nВведите желаемую яркость света (в %): ");
						bright = in.nextInt();
						kitch.Set_brightness_kitch(bright);
						System.out.println(
								"Яркость света на кухне будет изменена до " + kitch.Get_brightness_kitch() + " %");
					} else if (par == 5) {
						System.out.println("Включить (1) или выключить (0) свет?");
						light = in.nextInt();
						if (light == 1 && kitch.Get_light_kitch() != 1) {
							kitch.Set_light_kitch(light);
							System.out.println("Свет на кухне включен");
						} else if (light == 1) {
							System.out.println("Свет уже включен. Выключить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								kitch.Set_light_kitch(light);
								System.out.println("Свет на кухне выключен");
							}
						} else if (kitch.Get_light_kitch() == 0) {
							System.out.println("Свет уже выключен. Включить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								kitch.Set_light_kitch(light);
								System.out.println("Свет на кухне включен");
							}
						} else {
							kitch.Set_light_kitch(light);
							System.out.println("Свет на кухне выключен");
						}
					} else if (par == 6) {
						System.out.print("Введите желаемую скорость вентиляции: ");
						speed = in.nextInt();
						kitch.Set_vent_speed_kitch(speed);
						System.out.println("Скорость вентиляции на кухне будет изменена до "
								+ kitch.Get_vent_speed_kitch() + " %");
					} else if (par == 7) {
						System.out.println("Приготовить кофе? Да(1)/Нет(0)");
						coffee = in.nextInt();
						kitch.Set_coffee(coffee);
						kitch.coffee_machine();
					} else {
						System.out.println("Выберите пункт из предложенных!");
					}
					System.out.println("Желаете выбрать еще один параметр? Да(1)/Нет(0)");
					f_menu_par = in.nextInt();
				} while (f_menu_par == 1);
			else if (room == 3)
				do {
					bed.menu_bed();
					par = in.nextInt();
					if (par == 1) {
						System.out.print("Введите желаемую температуру воздуха (в °С): ");
						t = in.nextDouble();
						bed.Set_air_temp_bed(t);
						System.out.println(
								"Температура воздуха в спальне будет изменена до " + bed.Get_air_temp_bed() + " °С");
					} else if (par == 2) {
						System.out.print("Введите желаемую влажность воздуха (в %): ");
						hum = in.nextDouble();
						bed.Set_air_hum_bed(hum);
						System.out.println(
								"Влажность воздуха в спальне будет изменена до " + bed.Get_air_hum_bed() + " %");
					} else if (par == 3) {
						System.out.print("Введите желаемую концентрацию CO2 (в %): ");
						co2 = in.nextDouble();
						bed.Set_conc_co2_bed(co2);
						System.out.println(
								"Концентрация CO2 в спальне будет изменена до " + bed.Get_conc_co2_bed() + " %");
					} else if (par == 4) {
						System.out.print("Введите желаемую яркость света (в %): ");
						bright = in.nextInt();
						bed.Set_brightness_bed(bright);
						System.out.println(
								"Яркость света в спальне будет изменена до " + bed.Get_brightness_bed() + " %");
					} else if (par == 5) {
						System.out.println("Включить (1) или выключить (0) свет?");
						light = in.nextInt();
						if (light == 1 && bed.Get_light_bed() != 1) {
							bed.Set_light_bed(light);
							System.out.println("Свет в спальне включен");
						} else if (light == 1) {
							System.out.println("Свет уже включен. Выключить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								bed.Set_light_bed(light);
								System.out.println("Свет в спальне выключен");
							}
						} else if (bed.Get_light_bed() == 0) {
							System.out.println("Свет уже выключен. Включить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								bed.Set_light_bed(light);
								System.out.println("Свет в спальне включен");
							}
						} else {
							bed.Set_light_bed(light);
							System.out.println("Свет в спальне выключен");
						}
					} else if (par == 6) {
						System.out.print("Введите желаемую скорость вентиляции: ");
						speed = in.nextInt();
						bed.Set_vent_speed_bed(speed);
						System.out.println(
								"Скорость вентиляции в спальне будет изменена до " + bed.Get_vent_speed_bed() + " %");
					} else {
						System.out.println("Выберите пункт из предложенных!");
					}
					System.out.println("Желаете выбрать еще один параметр? Да(1)/Нет(0)");
					f_menu_par = in.nextInt();
				} while (f_menu_par == 1);
			else if (room == 4)
				do {
					bath.menu_bath();
					par = in.nextInt();
					if (par == 1) {
						System.out.print("Введите желаемую температуру воздуха (в °С): ");
						t = in.nextDouble();
						bath.Set_air_temp_bath(t);
						System.out.println(
								"Температура воздуха в ванной будет изменена до " + bath.Get_air_temp_bath() + " °С");
					} else if (par == 2) {
						System.out.print("Введите желаемую влажность воздуха (в %): ");
						hum = in.nextDouble();
						bath.Set_air_hum_bath(hum);
						System.out.println(
								"Влажность воздуха в ванной будет изменена до " + bath.Get_air_hum_bath() + " %");
					} else if (par == 3) {
						System.out.print("Введите желаемую концентрацию CO2 (в %): ");
						co2 = in.nextDouble();
						bath.Set_conc_co2_bath(co2);
						System.out.println(
								"Концентрация CO2 в ванной будет изменена до " + bath.Get_conc_co2_bath() + " %");
					} else if (par == 4) {
						System.out.print("Введите желаемую яркость света (в %): ");
						bright = in.nextInt();
						bath.Set_brightness_bath(bright);
						System.out.println(
								"Яркость света в ванной будет изменена до " + bath.Get_brightness_bath() + " %");
					} else if (par == 5) {
						System.out.println("Включить (1) или выключить (0) свет?");
						light = in.nextInt();
						if (light == 1 && bath.Get_light_bath() != 1) {
							bath.Set_light_bath(light);
							System.out.println("Свет в ванной включен");
						} else if (light == 1) {
							System.out.println("Свет уже включен. Выключить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								bath.Set_light_bath(light);
								System.out.println("Свет в ванной выключен");
							}
						} else if (bath.Get_light_bath() == 0) {
							System.out.println("Свет уже выключен. Включить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								bath.Set_light_bath(light);
								System.out.println("Свет в ванной включен");
							}
						} else {
							bath.Set_light_bath(light);
							System.out.println("Свет в ванной выключен");
						}
					} else if (par == 6) {
						System.out.print("Введите желаемую скорость вентиляции: ");
						speed = in.nextInt();
						bath.Set_vent_speed_bath(speed);
						System.out.println(
								"Скорость вентиляции в ванной будет изменена до " + bath.Get_vent_speed_bath() + " %");
					} else if (par == 7) {
						System.out.println("Набрать воду в ванную? Да(1)/Нет(0)");
						water = in.nextInt();
						bath.Set_flag_water(water);
						bath.water_bath();
					} else {
						System.out.println("Выберите пункт из предложенных!");
					}
					System.out.println("Желаете выбрать еще один параметр? Да(1)/Нет(0)");
					f_menu_par = in.nextInt();
				} while (f_menu_par == 1);
			else if (room == 5)
				do {
					wine.menu_wine();
					par = in.nextInt();
					if (par == 1) {
						System.out.print("Введите желаемую температуру воздуха (в °С): ");
						t = in.nextDouble();
						wine.Set_air_temp_wine(t);
						System.out.println("Температура воздуха в винном погребе будет изменена до "
								+ wine.Get_air_temp_wine() + " °С");
					} else if (par == 2) {
						System.out.print("Введите желаемую влажность воздуха (в %): ");
						hum = in.nextDouble();
						wine.Set_air_hum_wine(hum);
						System.out.println("Влажность воздуха в винном погребе будет изменена до "
								+ wine.Get_air_hum_wine() + " %");
					} else if (par == 3) {
						System.out.print("Введите желаемую концентрацию CO2 (в %): ");
						co2 = in.nextDouble();
						wine.Set_conc_co2_wine(co2);
						System.out.println("Концентрация CO2 в винном погребе будет изменена до "
								+ wine.Get_conc_co2_wine() + " %");
					} else if (par == 4) {
						System.out.print("Введите желаемую яркость света (в %): ");
						bright = in.nextInt();
						wine.Set_brightness_wine(bright);
						System.out.println("Яркость света в винном погребе будет изменена до "
								+ wine.Get_brightness_wine() + " %");
					} else if (par == 5) {
						System.out.println("Включить (1) или выключить (0) свет?");
						light = in.nextInt();
						if (light == 1 && wine.Get_light_wine() != 1) {
							wine.Set_light_wine(light);
							System.out.println("Свет в ванной включен");
						} else if (light == 1) {
							System.out.println("Свет уже включен. Выключить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								wine.Set_light_wine(light);
								System.out.println("Свет в ванной выключен");
							}
						} else if (wine.Get_light_wine() == 0) {
							System.out.println("Свет уже выключен. Включить свет? Да(1)/Нет(0)");
							light = in.nextInt();
							if (light == 1) {
								wine.Set_light_wine(light);
								System.out.println("Свет в ванной включен");
							}
						} else {
							wine.Set_light_wine(light);
							System.out.println("Свет в ванной выключен");
						}
					} else if (par == 6) {
						System.out.print("Введите желаемую скорость вентиляции: ");
						speed = in.nextInt();
						wine.Set_vent_speed_wine(speed);
						System.out.println("Скорость вентиляции в винном погребе будет изменена до "
								+ wine.Get_vent_speed_wine() + " %");
					} else {
						System.out.println("Выберите пункт из предложенных!");
					}
					System.out.println("Желаете выбрать еще один параметр? Да(1)/Нет(0)");
					f_menu_par = in.nextInt();
				} while (f_menu_par == 1);
			else {
				System.out.println("Выберите комнату из предложенных!");
			}
			System.out.println("Желаете выбрать другую комнату? Да(1)/Нет(0)");
			f_menu_rooms = in.nextInt();

			System.out.println("\n6) Продемонстрировать работу с массивом объектов");
			System.out.println(
					"===========================================================================================");
			System.out.println("На примере объектов класса Туалет");

			Toilet[] mas_toil = new Toilet[4];
			int j;
			for (j = 0; j < 4; j++) {
				mas_toil[j] = new Toilet();
			}
			mas_toil[0].Set_parametrs_toil(0, 0, 0, 0, 0, 0);
			mas_toil[1].Set_parametrs_toil(0, 0, 0, 60, 0, 0);
			mas_toil[2].Set_parametrs_toil(0, 0, 0, 0, 0, 0);
			mas_toil[3].Set_parametrs_toil(0, 0, 0, 0, 0, 0);
			int i;
			for (i = 0; i < 4; i++) {
				mas_toil[i].Set_air_temp_toil((i + 1) * 10);
				System.out.println("Температура туалета №" + (i + 1) + " = " + mas_toil[i].Get_air_temp_toil());
			}

			System.out.println(
					"\n7) Продемонстрировать возврат целочисленного значения из метода через вспомогательный класс");
			System.out.println(
					"===========================================================================================");
			System.out.println("На примере объектов класса Parametrs и Toilet");

			Parametrs par1 = new Parametrs();
			par1 = mas_toil[1].GetParam();
			System.out.println("Целое значение яркости света: " + par1.Get_brightness());

			System.out.println("\n8) Продемонстрировать разумное использование оператора this");
			System.out.println(
					"===========================================================================================");
			System.out.println("На примере класса Параметры");

			Parametrs[] mas_par = new Parametrs[4];
			for (j = 0; j < 4; j++) {
				mas_par[j] = new Parametrs();
			}

			// Задание полей скорости вентиляции объектов класса Parametrs:
			mas_par[0].Set_vent_speed(1);
			mas_par[1].Set_vent_speed(2);
			mas_par[2].Set_vent_speed(3);
			mas_par[3].Set_vent_speed(4);

			mas_par[0].NewList();

			// Вызов статической компанентной функции:
			mas_par[3].reprint();

			// Включение созданных компанентов в двусвязанный список:
			mas_par[0].Add();
			mas_par[1].Add();
			mas_par[2].Add();
			mas_par[3].Add();

			// Печать в обратном порядке значений элементов списка:
			mas_par[3].reprint();

			System.out.println("\n9) Продемонстрировать обработку строк (String)");
			System.out.println(
					"===========================================================================================");
			System.out.println("На примере строк Troitskiy и Prog, сравнение строк и сложение\n");

			String Troitskiy = new String();
			Troitskiy = "Извините, ";
			String Prog = new String();
			Prog = "что так поздно сдаю лабы:(";

			if (Troitskiy.equals(Prog))
				System.out.println("\nСтроки равны!");
			else {
				Troitskiy = Troitskiy + Prog;
				System.out.println(Troitskiy + "\n");
			}

			System.out.println("\nЛабораторная работа 8:");
			System.out.println("\n========================================");
			System.out.println("Модифицировать ваши проекты на С++, C# и Java путем добавления в один из классов\n"
					+ "как минимум одного статического поля и одного статического метода.");
			System.out.println("========================================\n");
			System.out.println("(Использовались статистический член класса \'Toilet\' \'lastToil\' и\n"
					+ "статистические методы класса \'NewList\' и \'reprint\')\n");

			// Задание полей скорости вентиляции объектов класса Parametrs:
			mas_par[0].Set_vent_speed(1);
			mas_par[1].Set_vent_speed(2);
			mas_par[2].Set_vent_speed(3);
			mas_par[3].Set_vent_speed(4);

			System.out.println("Вызов статической компанентной функции: \'Новый список\'\n");
			mas_par[0].NewList();

			System.out.println("Вызов статической компанентной функции: \'Напечатать список\'\n");
			// Вызов статической компанентной функции:
			mas_par[3].reprint();

			System.out.println("Добавление элементов в список.\n");
			// Включение созданных компанентов в двусвязанный список:
			mas_par[0].Add();
			mas_par[1].Add();
			mas_par[2].Add();
			mas_par[3].Add();

			System.out.println("Вызов статической компанентной функции: \'Новый список\'\n");
			System.out.println("========================================");
			// Печать в обратном порядке значений элементов списка:
			mas_par[3].reprint();
			System.out.println("\n========================================\n");

			Parametrs param1 = new Parametrs();
			Parametrs param2 = new Parametrs(20);
			Parametrs param3 = new Parametrs(20, 45, 10, 30, 0, 15);

			System.out.println("Лабораторная 9\n");
			System.out.println("Конструкторы класса Параметры:");
			System.out.println("\n1) Конструктор без параметров:");
			param1.Display();
			System.out.println("\n2) Конструктор с 1-им параметром:");
			param2.Display();
			System.out.println("\n3) Конструктор с параметрами:");
			param3.Display();
			System.out.println("\n\n");

			Toilet toil1 = new Toilet();
			Toilet toil2 = new Toilet(20);
			Toilet toil3 = new Toilet(20, 45, 10, 30, 0, 15);

			System.out.println("Конструкторы класса Туалет:");
			System.out.println("\n1) Конструктор без параметров:");
			toil1.DisplayToil();
			System.out.println("\n2) Конструктор с 1-им параметром:");
			toil2.DisplayToil();
			System.out.println("\n3) Конструктор с параметрами:");
			toil3.DisplayToil();
			System.out.println("\n\n");

			Kitchen kitch1 = new Kitchen();
			Kitchen kitch2 = new Kitchen(20);
			Kitchen kitch3 = new Kitchen(20, 45, 10, 30, 0, 15, 0);

			System.out.println("Конструкторы класса Кухня:");
			System.out.println("\n1) Конструктор без параметров:");
			kitch1.DisplayKitch();
			System.out.println("\n2) Конструктор с 1-им параметром:");
			kitch2.DisplayKitch();
			System.out.println("\n3) Конструктор с параметрами:");
			kitch3.DisplayKitch();
			System.out.println("\n\n");

			Bedroom bed1 = new Bedroom();
			Bedroom bed2 = new Bedroom(20);
			Bedroom bed3 = new Bedroom(20, 45, 10, 30, 0, 15);

			System.out.println("Конструкторы класса Спальня:");
			System.out.println("\n1) Конструктор без параметров:");
			bed1.DisplayBed();
			System.out.println("\n2) Конструктор с 1-им параметром:");
			bed2.DisplayBed();
			System.out.println("\n3) Конструктор с параметрами:");
			bed3.DisplayBed();
			System.out.println("\n\n");

			Bathroom bath1 = new Bathroom();
			Bathroom bath2 = new Bathroom(20);
			Bathroom bath3 = new Bathroom(20, 45, 10, 30, 0, 15, 0);

			System.out.println("Конструкторы класса Ванная:");
			System.out.println("\n1) Конструктор без параметров:");
			bath1.DisplayBath();
			System.out.println("\n2) Конструктор с 1-им параметром:");
			bath2.DisplayBath();
			System.out.println("\n3) Конструктор с параметрами:");
			bath3.DisplayBath();
			System.out.println("\n\n");

			Wine_vault wine1 = new Wine_vault();
			Wine_vault wine2 = new Wine_vault(20);
			Wine_vault wine3 = new Wine_vault(20, 45, 10, 30, 0, 15);

			System.out.println("Конструкторы класса Винный погреб:");
			System.out.println("\n1) Конструктор без параметров:");
			wine1.DisplayWine();
			System.out.println("\n2) Конструктор с 1-им параметром:");
			wine2.DisplayWine();
			System.out.println("\n3) Конструктор с параметрами:");
			wine3.DisplayWine();
			System.out.println("\n\n");

			Toilet[] toilArr = new Toilet[3];
			for (j = 0; j < 3; j++)
				toilArr[j] = new Toilet(20 + j);
			System.out.println("Инициализировать небольшой массив конструктором с одним параметром:");
			for (j = 0; j < 3; j++)
				toilArr[j].DisplayToil();
			System.out.println("\n\n");

			Parametrs param_try = new Parametrs();
			double temp;

			System.out.println("Лабораторная 10\n");

			while (param_try.Get_air_temp() == 0) {
				System.out.println("\nВведите температуру: ");
				temp = in.nextDouble();
				param_try.Set_air_temp(temp);
			}

			System.out.println("Введенная температура: " + param_try.Get_air_temp());

			Toilet[] toilArr_1 = new Toilet[3]; Toilet [][] toilArr_2 = new Toilet[2][2];

			toilArr_1[0] = new Toilet();
			toilArr_1[1] = new Toilet();
			toilArr_1[2] = new Toilet();

			for (i = 0; i < 3; i++)
				toilArr_1[i].Set_parametrs_toil(20 + j, 10 - j, 10 + j, 10 * j, 0, 80 / (j + 1));
			
			for (i = 0; i < 2; i++)
				for (j = 0; j < 2; j++)
					toilArr_2[i][j] = new Toilet();

			for (i = 0; i < 2; i++)
				for (j = 0; j < 2; j++)
					toilArr_2[i][j].Set_parametrs_toil(20 + j, 10 - j, 10 + j, 10 * j, 0, 80 / (j + 1));
			//=================================

			// Вывод
			//=================================
			System.out.println("\nОдномерный массив размером [3]");
			for (i = 0; i < 3; i++)
				toilArr_1[i].DisplayToil();

			System.out.println();

			System.out.println("Двумерный массив размером [2][2]");
			for (i = 0; i < 2; i++)
				for (j = 0; j < 2; j++)
					toilArr_2[i][j].DisplayToil();
			//=================================

			
		} while (f_menu_rooms == 1);
	}
}
