import myservice.SvcInterface;

module secondservice {
  requires library;
  provides SvcInterface with banana.OtherService;
}