package com.example.sesion07.demo.interfaces;

import java.util.List;

public class FuncionDemo {

	public static void main(String[] args) {

		List<String> listNum = List.of("1", "2", "3");

		listNum.stream()
		.map(numString -> {
			return Integer.valueOf(numString);
		})
		.map(result -> result * 2)
		.forEach(System.out::println);

	}

}
