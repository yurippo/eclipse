package com.yurippo.git;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoublePositivo {

}

//a anota��o eh apenas uma declara��o alguem precisa interpretar
//aquela anota��o e geralmente eh uma biblioteca
//eh por isso ela ve como @interface
//assim como a interface ela e abstrata ou seja precisa 
//ser implementada
//E ai vem as bibliotecas o Spring o Hybernate
//e varias outras bibliotecas que se baseam nas anota��es