package gabriellee.project.dependencyinjectionkodein.ui.quotes

import androidx.lifecycle.ViewModel
import gabriellee.project.dependencyinjectionkodein.data.model.Quote
import gabriellee.project.dependencyinjectionkodein.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}