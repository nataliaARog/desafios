package idwall.desafio.string.test;

import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import idwall.desafio.string.IdwallFormatter;

@RunWith(JUnit4.class)
public class IdwallFormatterTest {
	
	@InjectMocks
	private IdwallFormatter idwallFormatter;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void formatTestSucesso() {
		given(Mockito.spy(idwallFormatter).format(Mockito.anyString())).willReturn("");	
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected=Exception.class)
	public void formatTestErro() {
		given(Mockito.spy(idwallFormatter).format(null)).willThrow(UnsupportedOperationException.class);
		
	}
}
