package gabriellee.project.dependencyinjectionkodein.data.repository

import androidx.lifecycle.LiveData
import gabriellee.project.dependencyinjectionkodein.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}