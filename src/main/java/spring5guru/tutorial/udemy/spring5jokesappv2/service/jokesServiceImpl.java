package spring5guru.tutorial.udemy.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class jokesServiceImpl implements
    jokesService {
  ChuckNorrisQuotes quotes = null;

  public jokesServiceImpl() {
    this.quotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJokes() {
    return quotes.getRandomQuote();
  }

}
