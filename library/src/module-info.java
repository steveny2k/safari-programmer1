import myservice.SvcInterface;

module library {
  exports myservice;
  provides SvcInterface with impl.MyImplementation;
//  opens impl;
}