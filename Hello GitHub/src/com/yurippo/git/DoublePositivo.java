package com.yurippo.git;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoublePositivo {

}

//a anotação eh apenas uma declaração alguem precisa interpretar
//aquela anotação e geralmente eh uma biblioteca
//eh por isso ela ve como @interface
//assim como a interface ela e abstrata ou seja precisa 
//ser implementada
//E ai vem as bibliotecas o Spring o Hybernate
//e varias outras bibliotecas que se baseam nas anotações