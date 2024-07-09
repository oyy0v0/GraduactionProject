import request from '@/utils/request'

// 查询药品基本信息列表
export function listDruginfo(query) {
  return request({
    url: '/system/druginfo/list',
    method: 'get',
    params: query
  })
}

// 查询药品基本信息详细
export function getDruginfo(id) {
  return request({
    url: '/system/druginfo/' + id,
    method: 'get'
  })
}

// 新增药品基本信息
export function addDruginfo(data) {
  return request({
    url: '/system/druginfo',
    method: 'post',
    data: data
  })
}

// 修改药品基本信息
export function updateDruginfo(data) {
  return request({
    url: '/system/druginfo',
    method: 'put',
    data: data
  })
}

// 删除药品基本信息
export function delDruginfo(id) {
  return request({
    url: '/system/druginfo/' + id,
    method: 'delete'
  })
}
