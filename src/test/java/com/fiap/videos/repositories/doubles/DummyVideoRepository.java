package com.fiap.videos.repositories.doubles;

import com.fiap.videos.model.VideoModel;
import com.fiap.videos.repository.VideoRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class DummyVideoRepository implements VideoRepository {

    @Override
    public List<VideoModel> findByUserName(String userName) {
        return List.of();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends VideoModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends VideoModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<VideoModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public VideoModel getOne(Long aLong) {
        return null;
    }

    @Override
    public VideoModel getById(Long aLong) {
        return null;
    }

    @Override
    public VideoModel getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends VideoModel> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends VideoModel> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends VideoModel> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public List<VideoModel> findAll() {
        return List.of();
    }

    @Override
    public List<VideoModel> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public <S extends VideoModel> S save(S entity) {
        return null;
    }

    @Override
    public Optional<VideoModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(VideoModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends VideoModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<VideoModel> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<VideoModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends VideoModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends VideoModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends VideoModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends VideoModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends VideoModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
