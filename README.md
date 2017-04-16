# Testing Microservices using Java
  Micorservices enable you to isolate and scale smaller pieces of your application, rather than the entire application.
  
  1. Solitary Unit Tests(REST API, Peristence ORM & Remote Resources) - It focus on testing the unit or work in an isolated and controlled way, and the collaborators of the unit are replaced by test doubles or mocks.
  
  2. Sociable Unite Tests(Business Domain) - It focus on testing the behaviour of the class under test and its dependencies and collaborators by taking into consideration changes in state.

I've used the following tools and frameworks to test the application.

IDE - STS/IntelliJ/Eclipse/NetBeans
Frameworks - JUnit, AssertJ, Mockito,PowerMock and WireMock

JUnit(Fast and Isoloated): - It's a Java object annotated with special annotations to mark a method as a test.
1. @BeforeClass
2. @Before
3. @Test
4. @After
5. @AfterClass
6. @Parameterized

AssertJ(Readable) - What the test is about and also what the expected result should be.
1. assertEquals
2. assertFalse
3. assertTrue
4. assertNotEquals
5. assertNull
6. assertNotNull
7. assertSame
8. assertNotSame
9. assertThat
10. assertArrayEquals

Mockito - It allows the creating of test double objects (mock objects) with a clean and Simple API.There are four types of test doubles(Dummies, fakes, stubs & mocks).

WireMock - Simulator for HTTP/S based APIs.

1. Simulate faults and delays
2. Library or Standalone process
3. REST interface(JSON)
4. Java Api
