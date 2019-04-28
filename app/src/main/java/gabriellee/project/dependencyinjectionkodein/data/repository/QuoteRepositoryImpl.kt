package gabriellee.project.dependencyinjectionkodein.data.repository

import androidx.lifecycle.LiveData
import gabriellee.project.dependencyinjectionkodein.data.db.QuoteDao
import gabriellee.project.dependencyinjectionkodein.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}