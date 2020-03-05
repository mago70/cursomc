package com.celiosato.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.celiosato.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj); 
	
	void sendEmail(SimpleMailMessage msg); 

}
