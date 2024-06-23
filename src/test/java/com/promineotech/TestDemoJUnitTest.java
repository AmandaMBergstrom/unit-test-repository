package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;


public class TestDemoJUnitTest {

	private TestDemo testDemo;
	
	@BeforeEach
	void setUp(TestDemo testDemo) throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	@Test
	void assertTHatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if(!expectException) {
			assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
			assertThat(testDemo.addPositive(40, 50)).isEqualTo(90);
			assertThat(testDemo.addPositive(10, 15)).isEqualTo(25);

		} else {
			org.assertj.core.api.Assertions.assertThatThrownBy(null);
		}
		assertThatThrownBy(() ->

	    testDemo.addPositive(a, b));
	}
	static Stream<Arguments> argumentsForAddPositive() {
		//@formatter:off
		return Stream.of(
				arguments(2, 4,6, false),
				arguments(1, 1, 2, false),
				arguments(0, 5, 5, false),
				arguments(-1, 4, 3, false),
				arguments(3, 3, 6, false)
        	//@formatter:on	
        		);
	
		}
	 @Test
	    void assertThatNumberSquaredIsCorrect() {
	        TestDemo testDemo = new TestDemo();
	        TestDemo mockDemo = spy(testDemo);
	      
	        doReturn(5).when(mockDemo).getRandomInt();
	        int fiveSquared = mockDemo.randomNumberSquared();
	        assertThat(fiveSquared).isEqualTo(25);
	 }
	 //for fun
	 void assertTHatTwoNegativeNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
			if(!expectException) {
				assertThat(testDemo.addNegative(-4,5)).isEqualTo(1);
				assertThat(testDemo.addNegative(-10, 15)).isEqualTo(5);
				assertThat(testDemo.addNegative(-25, 15)).isEqualTo(-10);

			} else {
				org.assertj.core.api.Assertions.assertThatThrownBy(null);
			}
			assertThatThrownBy(() ->

		    testDemo.addNegative(a, b));
		}
	 
	}

	

