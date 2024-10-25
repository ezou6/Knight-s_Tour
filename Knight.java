����   = s  Knight  java/lang/Object currentCell LRowColPair; startingCell grid [[Z randy Ljava/util/Random; <clinit> ()V Code  java/util/Random
     <init>	   
  LineNumberTable LocalVariableTable (LRowColPair;I)V
   		    	
     
RowColPair ! " getRow ()I
  $ % " 	getColumn	  '  	  )   this LKnight; start n I r c StackMapTable getCurrentCell ()LRowColPair; getStartingCell getBoard ()[[Z solve ()[LRowColPair;
  : 2 3
  < = > getPossibleMoves (II)[LRowColPair;
  @ A  
clearBoard
  C D E nextInt (I)I
  G  H (II)V
  J K L getBestSquare ([LRowColPair;)LRowColPair; solution [LRowColPair; k cc possible newStartingRow newStartingCol best N setCurrentCell (LRowColPair;)V current setStartingCell
  [ \ ] getScoreOfSquare (II)I count minScore temp min pos rnd e [I
  g h i isValid (II)Z tor moves [[I move row col l 
SourceFile Knight.java !                  	   	 
            +      � Y� � �                         �     X*� *� � >� %6� *� 2T�*� 2����*� ����*� +� 2+� #T**+Z� &� (�       * 
            #  2  >  M  W     4    X * +     X ,     X - .   . / .    0 .  1    �      � �   2 3     /     *� &�           #         * +    4 3     /     *� (�           +         * +    5 6     /     *� �           3         * +    7 8    �     �*� �*� 2�h� L+*� (S=� �*� 9N*-� -� #� ;:�� Q*� ?� *� �� B6� *� 2�� B6*� Y� F� (**� (� &*� 2T+*� (S=� '*� I:*� &+S*� � 2� #T�+���o+�       V    <  =  >  ? " @ 0 A 6 B : C G D V E e F m G x H  I � J � L � M � N � O � > � R    R    � * +    � M N   � O .  " � P   0 x Q N  G : R .  V + S .  �  T   1    �  U� f  U� #  V W     >     *+� &�       
    \  ]         * +      X    Y W     >     *+� (�       
    d  e         * +      ,    K L    �     �=*+2� +2� #� Z>6� #*+2� +2� #� Z6� >�+����6� *+2� +2� #� Z� ��+����� :66� ,*+2� +2� #� Z6� +2S��+���ӻ Y� �� B62�       V    p  q  r  s - t 3 u 6 r @ { F | \ } _ { i � o � r � x � � � � � � � � � � � � �    z    � * +     � Q N   � ^ .   � _ .   * / .  - 	 ` .  C & / .  o N a N  r K b .  u 3 / .  �  ` .  �  c .  1   # 	� �    U U  %  A      �     ,<�  =� *� 2T�*� ����*� ���ݱ           �  � 
 �  �  � + �         , * +    ) / .    0 .  1    � � �   = >    [  
  26� dY�
YdOYdOSY�
YdOY`OSY�
YdOYdOSY�
YdOY`OSY�
Y`OYdOSY�
Y`OY`OSY�
Y`OYdOSY�
Y`OY`OS:6� 32.62.6*� f� *� 23� ������� N66� B2.62.6	*	� f� "*� 2	3� -� Y	� FS������-�       Z    �  � . � R � w � � � � � � � � � � � � � � � � � � � � � � � � � � � �" �% �0 �    �   2 * +    2 / .   2 0 .  � R j N  / ^ .  � � k l  � ; m .  � $ n .  �  o .  � O b .  � J m .  � 3 n .  � * o . 	 1   - � �    p  ,�    U p  ;  \ ]     F     *� ;��           �          * +      n .     o .   h i     |     $*� �d� � *� �d� 	� ���           �  �  �   � " �         $ * +     $ n .    $ o .  1       q    r