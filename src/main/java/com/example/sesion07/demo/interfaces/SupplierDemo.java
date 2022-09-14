package com.example.sesion07.demo.interfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();
		log.info("Result : " + time);
	}
}
